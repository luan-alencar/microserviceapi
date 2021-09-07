package david.augusto.luan.sgeservice.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProdutoDTO implements Serializable {

    private static final long serialVersionUID = 8086664283181515982L;

    private Long id;

    private String descricao;

    private Double preco;
}
