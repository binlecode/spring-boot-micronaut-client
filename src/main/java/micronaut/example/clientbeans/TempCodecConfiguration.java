package micronaut.example.clientbeans;

import io.micronaut.codec.CodecConfiguration;
import io.micronaut.http.MediaType;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
class TempCodecConfiguration extends CodecConfiguration {

    @Override
    public List<MediaType> getAdditionalTypes() {
        List<MediaType> types = new ArrayList<>();
        types.add(new MediaType("text/javascript"));
        return types;
    }
}
