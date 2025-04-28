package lk.ijse.finalproject.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class ItemDto {
    private String itemId;
    private String itemName;
    private int quantity;
    private double buyPrice;
    private double sellPrice;
}
