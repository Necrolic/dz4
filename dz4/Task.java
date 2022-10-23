package dz4;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private LocalDateTime presentTime;
    private String description;
    private String name;
    private String surname;

    public Task(Long id, LocalDateTime presentTime, String description, String name, String surname) {
        this.id = id;
        this.presentTime = presentTime;
        this.description = description;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getPresentTime() {
        return presentTime;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ",presentTime=" + presentTime +
                ",description='" + description + '\'' +
                ",name='" + name + '\'' +
                ",surname='" + surname + '\'' +
                '}';
    }
}
