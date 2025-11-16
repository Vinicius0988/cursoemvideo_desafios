public interface  BancoDados  extends SqlDML, SqlDDL, SqlDCL{

    void abrirConexao();
    void fecharConexao();
}
