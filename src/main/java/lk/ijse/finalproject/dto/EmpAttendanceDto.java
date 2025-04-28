package lk.ijse.finalproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmpAttendanceDto {
    private String attId;
    private String empId;
    private String dateTime;
    private String duration;
}
