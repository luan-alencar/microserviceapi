package david.augusto.luan.sgeservice.service.mapper;

import david.augusto.luan.sgeservice.domain.Produto;
import david.augusto.luan.sgeservice.service.dto.ProdutoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ProdutoMapper extends EntiyMapper<Produto, ProdutoDTO> {

    @Override
    Produto toEntity(ProdutoDTO dto);

    @Override
    ProdutoDTO toDTO(Produto entity);

    @Override
    List<Produto> toEntityList(List<ProdutoDTO> listDTO);

    @Override
    List<ProdutoDTO> toListDTO(List<Produto> listEntity);
}
