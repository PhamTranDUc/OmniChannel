export interface MessageRequest {
  conversationId: number;
  senderId: string;
  receiverId: string;
  message: string;
  timestamp: Date;
}
