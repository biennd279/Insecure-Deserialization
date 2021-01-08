package org.vcs.biennd3.student.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.SerializationUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;
import java.util.Objects;

@Data
@Slf4j
public class Base64Value {
    private String value;

    public Object deserialize() throws IOException, ClassNotFoundException {
        String value = this.getValue();
        byte[] objectBytes = Base64.getDecoder().decode(value);
//        ByteArrayInputStream bytes = new ByteArrayInputStream(objectBytes);
//        ObjectInputStream objectInputStream = new ObjectInputStream(bytes);
//        return (Student) objectInputStream.readObject();
        return SerializationUtils.deserialize(objectBytes);
    }
}
