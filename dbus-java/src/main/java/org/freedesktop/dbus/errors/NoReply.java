package org.freedesktop.dbus.errors;

import org.freedesktop.dbus.exceptions.DBusExecutionException;

/**
 * Thrown if there is no reply to a method call
 */
public class NoReply extends DBusExecutionException {
    public NoReply(String message) {
        super(message);
    }
}
