package de.faeuster.bosstimer.pojo;

import java.time.LocalTime;

public enum TimeSlot {
    SLOT1(1, LocalTime.of(0, 15)),
    SLOT2(2, LocalTime.of(2, 00)),
    SLOT3(3, LocalTime.of(5, 00)),
    SLOT4(4, LocalTime.of(9, 00)),
    SLOT5(5, LocalTime.of(12, 00)),
    SLOT6(6, LocalTime.of(16, 00)),
    SLOT7(7, LocalTime.of(19, 00)),
    SLOT8(8, LocalTime.of(22, 15));
    private final int slotNumber;
    private final LocalTime slotTime;


    TimeSlot(int slotNumber, LocalTime slotTime) {
        this.slotNumber = slotNumber;
        this.slotTime = slotTime;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public LocalTime getSlotTime() {
        return slotTime;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "slotNumber=" + slotNumber +
                ", slotTime=" + slotTime +
                '}';
    }
}
