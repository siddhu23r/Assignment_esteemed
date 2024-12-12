@Data
public class SubmitAnswerRequest {
    private Long questionId;
    private String selectedOption;
}

@Data
public class QuizSummaryResponse {
    private int totalQuestions;
    private int correctAnswers;
    private int incorrectAnswers;
}
