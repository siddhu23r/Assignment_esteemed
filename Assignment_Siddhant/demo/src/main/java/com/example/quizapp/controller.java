@RestController
@RequestMapping("/api/quiz")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @PostMapping("/start")
    public ResponseEntity<Void> startQuiz(@RequestParam String username) {
        quizService.startQuiz(username);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/question")
    public ResponseEntity<Question> getRandomQuestion() {
        return ResponseEntity.ok(quizService.getRandomQuestion());
    }

    @PostMapping("/submit")
    public ResponseEntity<Void> submitAnswer(@RequestParam String username,
                                             @RequestBody SubmitAnswerRequest request) {
        quizService.submitAnswer(username, request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<QuizSummaryResponse> getQuizSummary(@RequestParam String username) {
        return ResponseEntity.ok(quizService.getQuizSummary(username));
    }
}
