package david.augusto.luan.sgeservice.service;

import david.augusto.luan.sgeservice.domain.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProdutoService extends ServiceGenericEntity<Produto> {

    @Override
    List<Produto> findAll();

    @Override
    Produto save(Produto entity);

    @Override
    Produto update(Produto dto);

    @Override
    Produto getByIE(Long id);

    @Override
    void delete(Long id);
}
