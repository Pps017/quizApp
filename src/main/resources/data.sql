
INSERT INTO question (id, text, correct_answer) VALUES (1, 'What is the capital of France?', 'Paris');
INSERT INTO question (id, text, correct_answer) VALUES (2, 'What is 2 + 2?', '4');

INSERT INTO question_options (question_id, options) VALUES (1, 'Paris');
INSERT INTO question_options (question_id, options) VALUES (1, 'London');
INSERT INTO question_options (question_id, options) VALUES (1, 'Rome');
INSERT INTO question_options (question_id, options) VALUES (1, 'Berlin');

INSERT INTO question_options (question_id, options) VALUES (2, '3');
INSERT INTO question_options (question_id, options) VALUES (2, '4');
INSERT INTO question_options (question_id, options) VALUES (2, '5');
INSERT INTO question_options (question_id, options) VALUES (2, '6');
