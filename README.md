
# Quiz App API

This is a Spring Boot application that provides APIs for a quiz application. The APIs allow users to:

1. Start a new quiz session.
2. Retrieve a random multiple-choice question.
3. Submit an answer to a question.
4. Get a summary of the quiz session, including the total number of questions answered and the number of correct/incorrect answers.

---

## How It Works

### 1. **Start a New Quiz Session**
- **Endpoint:** `POST /api/quiz/start`
- **Description:** Creates a new quiz session, identified by a unique session ID.

### 2. **Retrieve a Random Question**
- **Endpoint:** `GET /api/quiz/question`
- **Description:** Returns a random question from the database for the provided session.
- **Parameters:**
  - `sessionId` (Query): The unique session ID.

### 3. **Submit an Answer**
- **Endpoint:** `POST /api/quiz/submit`
- **Description:** Submits an answer to a question and evaluates it.
- **Parameters:**
  - `sessionId` (Query): The unique session ID.
  - `questionId` (Query): The ID of the question being answered.
  - `answer` (Query): The user's answer.

### 4. **Get Quiz Summary**
- **Endpoint:** `GET /api/quiz/summary`
- **Description:** Returns the total questions answered, and the number of correct and incorrect answers.
- **Parameters:**
  - `sessionId` (Query): The unique session ID.

---

## Setup Instructions

1. **Clone the Repository**  
   Use `git clone` or download the project ZIP file and extract it.

2. **Run the Application**  
   - Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
   - Run the application using the IDE or command line:  
     ```bash
     mvn spring-boot:run
     ```

3. **Access the H2 Console**  
   - URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
   - JDBC URL: `jdbc:h2:mem:testdb`

---

## Database

The application uses an in-memory H2 database. Sample data is seeded at application startup using the `DataSeeder` class.

### Sample Questions

1. **What is the capital of France?**  
   Options: Paris, London, Rome, Berlin  

2. **What is 2 + 2?**  
   Options: 3, 4, 5, 6  

---

## Technologies Used

- **Framework:** Spring Boot
- **Database:** H2 In-Memory Database
- **ORM:** JPA (Java Persistence API)
- **Build Tool:** Maven

---

## Enhancements

This is a simple quiz API, but it can be enhanced by:
- Adding authentication for multiple users.
- Creating APIs to add new questions or manage quizzes.
- Implementing persistence using a production-grade database like MySQL or PostgreSQL.
