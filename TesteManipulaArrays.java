import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TesteManipulaArrays {

    private Gson arquivoJson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    private List<Produtos> listaProdutos = new ArrayList<>();

    Path path = Paths.get("C:\\Users\\RAFAEL\\IdeaProjects\\lista_de\\lista.json");
    String json = Files.readString(path);
    Produtos[] produtos = arquivoJson.fromJson(json, Produtos[].class);

    public TesteManipulaArrays() throws IOException {
    }

    public void add(int id) {
        for (int i = 0; i == produtos.length; i++) {
            listaProdutos.add(produtos[i]);
        }
    }

}
