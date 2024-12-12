@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuestionRepository questionRepository;
    private final QuizSessionRepository quizSessionRepository;

    public Question getRandomQuestion() {
        return questionRepository.getRandomQuestion();
    }

    public void startQuiz(String username) {
        QuizSession session = quizSessionRepository.findByUsername(username);
        session.setTotalQuestions(0);
        session.setCorrectAnswers(0);
        session.setIncorrectAnswers(0);
        quizSessionRepository.save(session);
    }

    public void submitAnswer(String username, SubmitAnswerRequest request) {
        QuizSession session = quizSessionRepository.findByUsername(username);
        session.setTotalQuestions(session.getTotalQuestions() + 1);

        Question question = questionRepository.findById(request.getQuestionId())
                .orElseThrow(() -> new RuntimeException("Question not found"));
        if (question.getCorrectOption().equalsIgnoreCase(request.getSelectedOption())) {
            session.setCorrectAnswers(session.getCorrectAnswers() + 1);
        } else {
            session.setIncorrectAnswers(session.getIncorrectAnswers() + 1);
        }
        quizSessionRepository.save(session);
    }

    public QuizSummaryResponse getQuizSummary(String username) {
        QuizSession session = quizSessionRepository.findByUsername(username);
        QuizSummaryResponse response = new QuizSummaryResponse();
        response.setTotalQuestions(session.getTotalQuestions());
        response.setCorrectAnswers(session.getCorrectAnswers());
        response.setIncorrectAnswers(session.getIncorrectAnswers());
        return response;
    }
}
