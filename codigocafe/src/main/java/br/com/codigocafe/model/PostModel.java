package br.com.codigocafe.model;

import br.com.codigocafe.enumerador.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tb_post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String conteudo;

    @Lob
    @Column(name = "imagem")
    private byte[] imagem;

    @Lob
    @Column(name = "video")
    private byte[] video;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Date dataCriacao;
    private Date dataAtualizacao;
    private Date dataPublicacao;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categorias;
}
