public interface SqlDML {
    void select(String query);
    void insert(String query);
    void update(String query);
    void delete(String query);
}
