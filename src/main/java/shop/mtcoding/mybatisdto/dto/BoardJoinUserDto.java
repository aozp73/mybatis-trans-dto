package shop.mtcoding.mybatisdto.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
    // private List<BoardDto> boards;
}
