package romeodombaj.sustavjavnoguzbunjivanjabe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import javax.management.Attribute;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Optional;

@Service
public class SirenServicImpl implements SirenService{

    @Autowired
    private SirenRepository sirenRepository;

    @Override
    public Siren saveSiren(Siren siren) {
        return sirenRepository.save((siren));
    }

    public Siren updateSirenByAttribute(int id, Map<String, Object> attribures){
        Optional<Siren> currentSiren = sirenRepository.findById(id);
        if(currentSiren.isPresent()){
            attribures.forEach((key, value) -> {
                Field field = ReflectionUtils.findField(Siren.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field, currentSiren.get(), value);
            });
            return sirenRepository.save(currentSiren.get());
        }
        return null;
    }
}
