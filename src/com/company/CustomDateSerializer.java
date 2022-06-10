package com.company;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class CustomDateSerializer extends StdSerializer<Date> {

    private SimpleDateFormat formatter
            = new SimpleDateFormat("yyyy-MM-dd");
//    private DateTimeFormatter formatter
//        = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public CustomDateSerializer() {
        this(null);
    }

    public CustomDateSerializer(Class t) {
        super(t);
    }

    @Override
    public void serialize (Date value, JsonGenerator gen, SerializerProvider arg2)
            throws IOException, JsonProcessingException {
        gen.writeString(formatter.format(value));
    }
//    public void serialize (LocalDate value, JsonGenerator gen, SerializerProvider arg2)
//            throws IOException, JsonProcessingException {
//        gen.writeString(value.format(formatter));
//    }
}