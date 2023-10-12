/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author Lidia
 */
public final class HealthFacility {
    private final String facilityName;
    private final String facilityType;

    public HealthFacility(final String facilityName, final String facilityType) {
        this.facilityName = facilityName;
        this.facilityType = facilityType;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public String getFacilityType() {
        return facilityType;
    }
}


