* Movie Watchlist Backend

This is a Java Spring Boot backend application for managing a personal movie watchlist.  
It is built for the OOP3 assignment and integrates with (stubbed) versions of OMDb and TMDB APIs.

* Features

- Fetch movie data from external APIs (simulated via stubs)
- Multithreaded API calls using `@Async`
- Stores movie data in an H2 in-memory database
- Simulates downloading 3 image files per movie
- REST API for:
  - Creating new movies via title lookup
  - Updating watched status and rating
  - Searching and filtering movies
  - Deleting movies from the watchlist

* What's used

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

* Setup

1. Clone this repo:
   ```bash
   git clone https://github.com/Natalia430/oop3-assignment-700645.git
   ```

2. Navigate into the project folder:
   ```bash
   cd oop3-assignment-700645
   ```

3. Build and run:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Access H2 database at:
   ```
   http://localhost:8080/h2-console
   ```

* API Usage

* Add a new movie
```
POST /api/movie/fetch-and-add?title=Inception
```

This triggers:
- A simulated API call to OMDb for basic movie data
- A simulated API call to TMDB for similar movies and image paths
- Simulated image downloads
- Data is saved to the database

* Update Watched Status
```
PUT /api/movie/{id}/watched
```

* Update Rating
```
PUT /api/movie/{id}/rating
```

* Delete Movie
```
DELETE /api/movie/delete/{id}
```

* Notes

- **Real API integration is not included** due to lack of keys, but stub methods are clearly separated and easy to replace. I had authentification trouble..
- Code is structured using proper MVC principles and is cleanly documented for extension.

* Author

Natalia Kotynska  
Student ID: 700645
