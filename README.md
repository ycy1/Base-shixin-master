# 拾信管理系统 (Shixin Base)

基于 Spring Boot 2.7 + Vue 3 + Element Plus 的通用后台管理系统模板。

## 技术栈

### 后端
- **核心框架**: Spring Boot 2.7.0
- **ORM**: MyBatis-Plus 3.5.2
- **权限认证**: Sa-Token 1.39.0
- **数据库**: MySQL 8.0
- **缓存**: Redis 6.0.5
- **接口文档**: Knife4j 4.4.0
- **定时任务**: Quartz
- **文件存储**: x-file-storage 2.2.1 (支持本地、七牛云、阿里云OSS、腾讯云COS、MinIO)
- **支付集成**: 微信支付 + 支付宝 (支持订单管理、退款管理)
- **AI能力**: LangChain4j 1.0.0-beta3 (支持多Agent、RAG知识库、流式对话)
- **微信公众号**: weixin-java-mp 4.7.7

### 前端
- **框架**: Vue 3.2.47 + TypeScript 5.4.5
- **构建工具**: Vite 6.3.5
- **UI组件**: Element Plus 2.3.0
- **状态管理**: Pinia 2.0.33
- **图表**: ECharts 5.5.1
- **Markdown**: Mavon Editor 3.0.1

## 项目结构

```
blog/                          # 后端项目
├── shixin-admin/              # 后台管理接口模块
├── shixin-ai/                 # AI模块 (LangChain4j + RAG)
├── shixin-api/                # 门户接口模块 (预留扩展)
├── shixin-auth/               # 认证模块 (Sa-Token + 社交登录)
├── shixin-commom/             # 通用模块 (实体、工具类、配置)
├── shixin-file/               # 文件存储模块
├── shixin-quartz/             # 定时任务模块
├── shixin-server/             # 启动模块 (配置文件、资源)
├── shixin-wx/                 # 微信公众号模块
└── pom.xml                    # Maven父工程

blog-admin/                    # 前端管理后台
├── src/
│   ├── api/                   # API接口
│   ├── components/            # 公共组件
│   ├── views/                 # 页面视图
│   ├── router/                # 路由配置
│   ├── store/                 # Pinia状态管理
│   ├── utils/                 # 工具函数
│   └── layouts/               # 布局组件
├── package.json
└── vite.config.ts
```

## 功能模块

### 系统管理
- 用户管理
- 角色管理
- 菜单管理
- 部门管理
- 字典管理
- 系统配置
- 操作日志

### 系统监控
- 服务器监控 (CPU/内存/磁盘)
- 缓存监控 (Redis)
- 在线用户
- 定时任务

### 开发工具
- 代码生成器

### AI模块
- 多Agent配置
- 知识库管理 (RAG)
- 对话管理
- 流式输出

### 文件管理
- 多平台文件上传
- 文件中心

### 支付管理
- 订单管理 (创建、查询、状态管理)
- 退款管理 (申请、审核、退款执行)
- 微信支付 (Native支付、退款)
- 支付宝支付
- 通用订单模型 (支持多种业务类型)

### 微信公众号
- 菜单管理
- 素材管理
- 群发消息
- 用户管理

## 快速开始

### 环境要求
- JDK 17+
- MySQL 8.0+
- Redis 6.0+
- Node.js 16+

### 后端启动

1. 导入数据库SQL文件
2. 修改配置文件 `shixin-server/src/main/resources/application-dev.yml`
   - 数据库连接
   - Redis连接
   - 文件存储配置
   - 第三方登录配置 (可选)

3. 启动主类 `com.shixin.NeatAdminApplication`

### 前端启动

```bash
cd blog-admin
npm install
npm run dev
```

访问 http://localhost:3000

默认账号: admin / 123456

## 接口文档

启动后端后访问: http://localhost:8800/shixin/doc.html

## 配置说明

### 文件存储
支持多种存储方式，在 `application-file.yml` 中配置:
- local: 本地存储
- qiniu: 七牛云OSS
- aliyun: 阿里云OSS
- tencent: 腾讯云COS
- minio: MinIO

### AI模块
在 `application-dev.yml` 中配置AI模型:
- 支持 DeepSeek、通义千问、Ollama 等
- 配置API Key和模型名称

### 社交登录
在 `application-dev.yml` 中配置第三方登录:
- QQ登录
- 微博登录
- Gitee登录
- GitHub登录

## 开发规范

- 包名: `com.shixin.*`
- 代码风格: 遵循阿里巴巴Java开发规范
- 前端规范: Vue 3 Composition API + TypeScript

## 许可证

MIT License
