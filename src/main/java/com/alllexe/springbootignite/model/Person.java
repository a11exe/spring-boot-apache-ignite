package com.alllexe.springbootignite.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ignite.cache.query.annotations.QuerySqlField;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @QuerySqlField(index = true)
    private Long id;
    @QuerySqlField
    private String firstName;
    /** Will NOT be visible for SQL engine. */
    private String lastName;
    private int age;
}