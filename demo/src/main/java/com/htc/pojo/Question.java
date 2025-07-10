/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htc.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Question {

    private int id;
    private String content;
    private String hint;
    private String image;
    private Category category;
    private Level level;
    private List<Choice> choices;

    private Question(Builder b) {
        this.id = b.id;
        this.content = b.content;
        this.hint = b.hint;
        this.image = b.image;
        this.category = b.category;
        this.level = b.level;
        this.choices = b.choices;
    }

    public static class Builder {

        private int id;
        private String content;
        private String hint;
        private String image;
        private Category category;
        private Level level;
        private List<Choice> choices = new ArrayList<>();

        public Builder(String content, Category c, Level l) {
            this.content = content;
            this.category = c;
            this.level = l;
        }

        public Builder addHint(String h) {
            this.hint = h;
            return this;
        }

        public Builder addImage(String im) {
            this.image = im;
            return this;
        }

        public Builder addChoice(Choice c) {
            this.choices.add(c);
            return this;
        }

        public Question build() {
            return new Question(this);
        }
    }

}
