package david.augusto.luan.sgeservice.service.impl;

import david.augusto.luan.sgeservice.domain.Produto;
import david.augusto.luan.sgeservice.repository.ProdutoRepository;
import david.augusto.luan.sgeservice.service.ProdutoService;
import david.augusto.luan.sgeservice.service.mapper.ProdutoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProdutoServiceImpl implements ProdutoService {

    @Override
    public List<Produto> findAll() {
        return null;
    }

    @Override
    public Produto save(Produto entity) {
        return null;
    }

    @Override
    public Produto update(Produto dto) {
        return null;
    }

    @Override
    public Produto getByIE(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
