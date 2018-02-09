package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tasks")
public class Task {
    private Long id;
    private String title;
    private String content;
}
