package lk.ijse.finalproject.Model;

import lk.ijse.finalproject.dto.OrderPaymentDto;
import lk.ijse.finalproject.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderPaymentModel {
    public boolean saveOrderPayment(OrderPaymentDto orderPaymentDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("INSERT INTO Order_Payment VALUES(?,?,?,?,?)",
                orderPaymentDto.getOpId(),
                orderPaymentDto.getSupId(),
                orderPaymentDto.getSoId(),
                orderPaymentDto.getAmount(),
                orderPaymentDto.getPayType()
                );
    }
    public boolean updateOrderPayment(OrderPaymentDto orderPaymentDto) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("UPDATE Order_Payment SET supplier_id = ? , so_id = ? , amount = ? , op_pay_type = ? WHERE op_id = ?",
                orderPaymentDto.getSupId(),
                orderPaymentDto.getSoId(),
                orderPaymentDto.getAmount(),
                orderPaymentDto.getPayType(),
                orderPaymentDto.getOpId()
                );
    }
    public boolean deleteOrderPayment(String opId) throws SQLException, ClassNotFoundException {
        return CrudUtil.execute("DELETE FROM Order_Payment WHERE op_id = ?",
                opId);
    }
    public OrderPaymentDto serchOrderPayment(String opId) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.execute("SELECT * FROM Order_Payment")
    }
}
