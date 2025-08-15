# Job Portal Application

## Tech Stack:
- **Backend**: Spring Boot, Java, Spring Security
- **Frontend**: HTML, CSS, JavaScript, Thymeleaf
- **Database**: MySQL

## Description:
One of the best projects I’ve worked on was a **Job Portal Application**, which I developed as part of my internship. The goal of the project was to create a web-based platform where **job seekers** could search for job listings and apply for positions, while **employers** (recruiters) could post job openings and review applications.

### Key Features:
- **User Authentication**: Implemented login and registration functionality for both job seekers and employers using **Spring Security**.
  
- **Job Search & Filters**: Developed a search functionality allowing job seekers to filter job listings by criteria such as job type, location, and salary.

- **Job Posting**: Employers were able to create job postings, manage job descriptions, and set application deadlines.

- **Application Management**: Job seekers could apply to jobs, and employers could view and manage incoming applications.

- **Database Design**: Designed a relational database using **MySQL** to store user data, job listings, and applications efficiently.

## Tech Stack Used:
### Backend:
- **Spring Boot**: Used to build the backend services for the application. The project was built as a RESTful web service using Spring Boot to handle HTTP requests and responses efficiently.
- **Java**: Used for the backend logic and server-side operations such as user authentication, job posting management, and application processing.
- **Spring Security**: Integrated to handle user authentication and authorization. This allowed users to have different access levels based on whether they were job seekers or employers.

### Frontend:
- **HTML, CSS, JavaScript**: Used to design the UI, focusing on providing a user-friendly interface for both job seekers and employers.
- **Thymeleaf**: Utilized for rendering dynamic web pages, integrating it with Spring Boot for seamless server-side processing of HTML content.

### Database:
- **MySQL**: Used for storing user details, job listings, and applications. Designed optimized database schemas and relationships to ensure fast querying and secure data storage.

## Challenges:
- **Authentication and Role Management**: One of the significant challenges was implementing user roles and permissions to ensure that job seekers and employers had access to the appropriate features. I used **Spring Security** to implement role-based access control and ensure that users could only access the areas of the portal that matched their role.
  
- **Search Functionality**: Designing an efficient job search feature with filtering capabilities required careful database optimization and use of SQL queries to retrieve relevant data quickly.

## Outcome:
The project was successfully completed and it greatly enhanced my understanding of full-stack development, particularly in building scalable web applications. The project was well-received for its clean architecture and smooth user experience, especially for handling large volumes of job listings and applications. I also gained hands-on experience in integrating the backend with the frontend, working with databases, and deploying the application for real-world use.

---

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/job-portal.git
    ```

2. Navigate to the project directory:
    ```bash
    cd job-portal
    ```

3. Install the required dependencies using **Maven**:
    ```bash
    mvn clean install
    ```

4. Configure MySQL:
   - Set up a MySQL database and configure the connection in `application.properties`.

5. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```
