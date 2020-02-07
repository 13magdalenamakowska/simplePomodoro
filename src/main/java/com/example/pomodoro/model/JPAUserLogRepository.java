//package com.example.logowanie.model;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.Optional;
//
//public interface JPAUserLogRepository {
//    Optional<User> findByEmail(String email);
//    Optional<User> findUserByEmailAndPassword(String email, String password); //select * from users where email=:email and password=:password
//    Optional<User> findUserByEmailLike(String searchPattern); //select * from users where email like ":searchPattern"
//    Optional<User> findUsersByEmailContaining(String email); //select * from users where email like "%:email%
//
//    //czasami mogę jawnie powiedziec select - rzadko się pisze samemu
//    @Query("select u.id, u.email from User u where u.email = :user_email")
//    Optional<User> customFindUserByEmail(@Param("user_email") String email);
//}
