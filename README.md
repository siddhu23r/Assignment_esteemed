# Quiz App API

## Assumptions
- The app has one user (`user1`).
- H2 database is used to store questions and quiz session data.

## Steps to Run
1. Clone the repository.
2. Open the project in an IDE with Spring Boot support.
3. Run the application (`QuizAppApplication`).
4. Use Postman or browser to test APIs.

## APIs
1. `POST /api/quiz/start?username={username}` - Start a new quiz session.
2. `GET /api/quiz/question` - Get a random question.
3. `POST /api/quiz/submit?username={username}` - Submit an answer.
4. `GET /api/quiz/summary?username={username}` - Get quiz summary.
