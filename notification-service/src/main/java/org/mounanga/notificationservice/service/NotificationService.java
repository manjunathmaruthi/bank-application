package org.mounanga.notificationservice.service;

import org.mounanga.notificationservice.dto.NotificationRequestDTO;

public interface NotificationService {

    void sendNotification(NotificationRequestDTO notification);
}
