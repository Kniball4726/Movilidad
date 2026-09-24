/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/** Estados posibles de una reserva o servicio de movilidad. */
public enum Estado {
    /** Reserva recién creada. */
    INICIADA,
    /** Reserva que está siendo atendida. */
    EN_PROCESO,
    /** Reserva completada. */
    FINALIZADA,
    /** Reserva detenida temporalmente. */
    SUSPENDIDA
}
