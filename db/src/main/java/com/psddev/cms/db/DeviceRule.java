package com.psddev.cms.db;

/**
 * @deprecated No replacement.
 */
@Deprecated
@Rule.DisplayName("Device")
public class DeviceRule extends Rule {

    private DeviceType type;

    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    // --- Rule support ---

    @Override
    public boolean evaluate(Variation variation, Profile profile, Object object) {
        return getType().evaluate(profile);
    }
}
