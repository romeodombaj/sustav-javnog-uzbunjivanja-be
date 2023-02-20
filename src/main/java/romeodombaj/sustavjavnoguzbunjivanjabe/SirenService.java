package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface SirenService {
    public  Siren saveSiren(Siren siren);

    public Siren updateSirenByAttribute(int id, Map<String, Object> attribures);


}
