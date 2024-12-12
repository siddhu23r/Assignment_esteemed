// Question.java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctOption;
}

// QuizSession.java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username; // Assuming a single user setup
    private int totalQuestions;
    private int correctAnswers;
    private int incorrectAnswers;
}
