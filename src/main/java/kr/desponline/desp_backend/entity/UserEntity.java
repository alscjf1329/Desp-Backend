package kr.desponline.desp_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;

@Entity
@Getter
@Setter
@Qualifier(value = "despdbEntityManagerFactory")
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    private int cash;
    private int mileage;
}
