package com.example.springday4.Pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employees {
    @NotNull
    @Min(2)
    private String ID;
    @NotEmpty
    @Size(min = 4,max = 8 ,message = "name can't be null")
    private String name;
    @NotNull
    @Min(25)
    private  int age;
    @NotEmpty

    private String role;
@AssertFalse
    private boolean onLeave;
    @NotNull
    @Positive
    @Past
    private String employmentYear;

    @NotEmpty
    @PositiveOrZero
    private String annualLeave;

}
