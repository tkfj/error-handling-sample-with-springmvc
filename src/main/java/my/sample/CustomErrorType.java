package my.sample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorType implements Serializable{
    private static final long serialVersionUID = 6848094629689703926L;
    private int statusCode;
    private String message;
}
