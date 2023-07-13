package kr.gamso.repository;

import kr.gamso.dto.urlDTO.FindAllShortenUrlDTO;
import kr.gamso.dto.urlDTO.FindByUrlNumberDTO;
import kr.gamso.dto.urlDTO.InsertShortenUrlDTO;
import kr.gamso.dto.urlDTO.UpdateShortenUrlDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UrlRepository {
    List<FindAllShortenUrlDTO> findAllShortenUrl();
    FindByUrlNumberDTO findByUrlNumber(long urlNumber);
    void saveShortenUrl(InsertShortenUrlDTO insertShortenUrlDTO);
    void deleteShortenUrl(String shortenUrl);
    void updateShortenUrl(UpdateShortenUrlDTO updateShortenUrlDTO);
}
