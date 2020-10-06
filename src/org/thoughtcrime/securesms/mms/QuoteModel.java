package org.thoughtcrime.securesms.mms;


import androidx.annotation.Nullable;

import com.b44t.messenger.DcContact;

import org.thoughtcrime.securesms.attachments.Attachment;

import java.util.List;

public class QuoteModel {

  private final long             id;
  private final DcContact author;
  private final String           text;
  private final boolean          missing;
  private final List<Attachment> attachments;

  public QuoteModel(long id, DcContact author, String text, boolean missing, @Nullable List<Attachment> attachments) {
    this.id          = id;
    this.author      = author;
    this.text        = text;
    this.missing     = missing;
    this.attachments = attachments;
  }

  public long getId() {
    return id;
  }

  public DcContact getAuthor() {
    return author;
  }

  public String getText() {
    return text;
  }

  public boolean isOriginalMissing() {
    return missing;
  }

  public List<Attachment> getAttachments() {
    return attachments;
  }

}