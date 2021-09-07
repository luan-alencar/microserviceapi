package david.augusto.luan.sgeservice.service;

import david.augusto.luan.sgeservice.domain.Produto;
import david.augusto.luan.sgeservice.service.dto.ProdutoDTO;

import java.util.List;

public interface ProdutoService extends ServiceGenericEntity<Produto, ProdutoDTO> {

    @Override
    List<ProdutoDTO> findAll();

    @Override
    ProdutoDTO save(Produto entity);

    @Override
    ProdutoDTO update(ProdutoDTO dto);

    @Override
    ProdutoDTO getByID(Long id);

    @Override
    void delete(Long id);
}
