INSERT INTO question (question_text, option_a, option_b, option_c, option_d, correct_option)
VALUES
('What is the capital of France?', 'Paris', 'London', 'Berlin', 'Madrid', 'A'),
('Which planet is known as the Red Planet?', 'Earth', 'Mars', 'Jupiter', 'Venus', 'B');

INSERT INTO quiz_session (username, total_questions, correct_answers, incorrect_answers)
VALUES ('user1', 0, 0, 0);
