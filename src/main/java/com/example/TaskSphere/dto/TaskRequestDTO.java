package com.example.TaskSphere.dto;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
public class TaskRequestDTO {
    @NotBlank(message = "this is required") //just showing the customm messaages which should not be blank
    private String title;
    @NotNull(message = "This is required")
    private Long userId;
    @NotBlank(message="status should not be empty")
    private String status;
    @NotNull(message = "Due date must be provided")
    private LocalDate dueDate;
    //@FutureOrPresent(message = "due date must be in present or future")

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
