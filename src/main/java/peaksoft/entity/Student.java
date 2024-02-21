package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.enums.Gender;

import java.util.List;

@Entity
@Table(name = "student")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_gen", sequenceName = "student_seq", allocationSize = 1)
    private Long id;
    private String fullName;
    private String lastName;
    private int age;
    @Column(length = 200000)
    private String image;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Student(String fullName, String lastName, int age, String image, Gender gender) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.age = age;
        this.image = image;
        this.gender = gender;
    }
}
