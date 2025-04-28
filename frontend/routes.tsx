import React from "react";
import MainView from "./views/MainView";
import MainLayout from "./views/MainLayout";
import ChatView from "./views/chat/ChatView";
import StreamingChatView from "./views/streaming-chat/StreamingChatView";
import {
    createBrowserRouter,
    RouteObject
} from "react-router-dom";

export const routes: readonly RouteObject[] = [
  { path: "/", element: <MainLayout /> },
  { path: "/chat", element: <ChatView /> },
  { path: "/streaming", element: <StreamingChatView /> },
];

export const router = createBrowserRouter([...routes], {basename: new URL(document.baseURI).pathname });
