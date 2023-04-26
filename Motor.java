import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Motor {
    private List<Produtos> listaProdutos = new ArrayList<>();
    private Gson arquivoJson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public Motor() throws IOException {}
    public void iniciaLista() throws IOException {
        Path path = Paths.get("C:\\Users\\RAFAEL\\IdeaProjects\\lista_de\\lista.json");
        String json = Files.readString(path);
        Produtos[] produtos = arquivoJson.fromJson(json, Produtos[].class);

        if (produtos != null) {
            for (int i = 0; i < produtos.length; i++) {
                listaProdutos.add(produtos[i]);
            }
        }

    }
    public void escreveArquivo() throws IOException {
        FileWriter escreveArquivo = new FileWriter("lista.json");
        escreveArquivo.write(arquivoJson.toJson(listaProdutos));
        escreveArquivo.close();
    }
    public void addItem(String nome, double quantidade, String unidade) throws IOException {
        listaProdutos.add(new Produtos(nome, quantidade, unidade));
    }
    public void deletaItem(int identificador) throws IOException {
        if (listaProdutos.size() >= (identificador-1) ) {
            if (identificador >= 1) {
                listaProdutos.remove(identificador-1);
            }
        }
    }
    public void getLista() throws IOException {
        System.out.println("");
        System.out.println("Lista de produtos");
        System.out.println("----------------------");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println("ID:"+(i+1)+" "+listaProdutos.get(i).getNome()+" "+listaProdutos.get(i).getQuantidade()+" "+listaProdutos.get(i).getUnidade());
        }
    }

}
