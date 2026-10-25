package br.com.moises.finance.model;

public class Category {
    private Long id;
    private String name;
    private CategoryType type;
    private final User owner;

    public Category(Long id, String name, CategoryType type, User owner) {
        validateName(name);
        validateType(type);

        this.id = id;
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public CategoryType getType() {
        return this.type;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setType(CategoryType type) {
        validateType(type);
        this.type = type;
    }

    public void rename(String newName) {
        validateName(newName);
        this.name = newName;
    }

    private static void validateName(String name) {
        if (name == null || name.isBlank()) {
          throw new IllegalArgumentException("Category name must not be null or blank.");
        }
    }

    private static void validateType(CategoryType type) {
        if (type == null) {
            throw new IllegalArgumentException("Category type must not be null.");
        }
    }
}
