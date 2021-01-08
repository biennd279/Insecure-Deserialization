package org.vcs.biennd3.student.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.util.SerializationUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.Year;
import java.util.Base64;

@Data
public class Student implements Serializable {
//    private static final long serialversionUID = -129348938L;
    private String username;
    private String email;
    private Year year;
    private Gender gender;

    public static enum Gender {
        MALE, FEMALE
    }

    public String serialize() throws IOException {
        return Base64.getEncoder().encodeToString(SerializationUtils.serialize(this));
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//        objectOutputStream.writeObject(this);
//        objectOutputStream.flush();
//        return new String(Base64.getEncoder().encode(byteArrayOutputStream.toByteArray()));
    }
}
