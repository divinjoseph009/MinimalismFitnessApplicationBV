package com.health.MinimalismFitnessApp;

public class TestConstants {

    public static final String EXPECTED_ALL_NUTRITION_JSON = """
            [{"id":1000,"foodName":"Pizza","calories":500,"protein":40,"carbohydrates":30,"fats":30,"mealType":"Lunch","user":{"id":100,"name":"Rais","height":180.0,"weight":85.0,"birthdate":"2000-01-01","gender":"MALE"}},{"id":2000,"foodName":"Burger","calories":600,"protein":60,"carbohydrates":20,"fats":20,"mealType":"Dinner","user":{"id":200,"name":"Divin","height":160.0,"weight":68.0,"birthdate":"1999-01-01","gender":"MALE"}}]""";

    public static final String EXPECTED_ONE_NUTRITION_JSON = """
            {"id":1000,"foodName":"Pizza","calories":500,"protein":40,"carbohydrates":30,"fats":30,"mealType":"Lunch","user":{"id":100,"name":"Rais","height":180.0,"weight":85.0,"birthdate":"2000-01-01","gender":"MALE"}}""";


}
