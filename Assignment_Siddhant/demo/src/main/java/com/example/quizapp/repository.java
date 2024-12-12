@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query(value = "SELECT * FROM question ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Question getRandomQuestion();
}

@Repository
public interface QuizSessionRepository extends JpaRepository<QuizSession, Long> {
    QuizSession findByUsername(String username);
}
