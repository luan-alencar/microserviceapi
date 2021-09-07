package david.augusto.luan.sgeservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    private static final long serialVersionUID = 8323641732296152291L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "PRECO")
    private Double preco;

}
